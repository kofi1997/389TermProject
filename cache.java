import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.logging.Logger;
public class cache{
  private long timeToLive;
  private static final Logger logger = Logger.getLogger(
	      cache.class.getCanonicalName());
  private HashMap<String, cacheObject> cacheMap;
  protected class cacheObject{
    public long lastAccessed=System.currentTimeMillis();
    public File value;
    protected cacheObject(){
    }
    protected cacheObject(File value){
      this.value=value;
    }
	@Override
	public String toString() {
		return "File [ " + value + " ] ";
	}
    
  }
  public cache(long timeToLive/*, final long timeInterval*/, int max){
    this.timeToLive = timeToLive * 2000;
        
        cacheMap = new HashMap<String, cacheObject>(max);
        /*
        if (timeToLive > 0 && timeInterval > 0) {
            
            Thread t = new Thread(new Runnable() {
                public void run() {
                    while (true) {
                        try {
                            Thread.sleep(timeInterval * 1000);
                        } catch (InterruptedException ex) {
                        }
                    }
                }
            });
            
            t.setDaemon(true);
            t.start();
        }*/
  }
  
  // PUT method
    public void put(String key, cacheObject value) {
        synchronized (cacheMap) {
            cacheMap.put(key, value);
            logger.info(value.toString()+"added at key"+ key);
        }
    }
    
    // GET method
    //@SuppressWarnings("unchecked")
    public File get(String key) {
        synchronized (cacheMap) {
            cacheObject c = (cacheObject) cacheMap.get(key);
            
            if (c == null){
            	logger.info("No file found at key"+ key);
                return null;
            }
            else {
                c.lastAccessed = System.currentTimeMillis();
                logger.info("File "+ c.value+" retrieved at key "+ key);
                return (File) c.value;
            }
        }
    }
    
    // REMOVE method
    public void remove(String key) {
        synchronized (cacheMap) {
            cacheMap.remove(key);
        }
    }
    
     // Get Cache Objects Size()
    public int size() {
        synchronized (cacheMap) {
            return cacheMap.size();
        }
    }
    
    // CLEANUP method
    public void cleanup() {
        
        long now = System.currentTimeMillis();
        ArrayList<String> deleteKey = null;
        
        synchronized (cacheMap) {
            Iterator<?> itr = cacheMap.keySet().iterator();
            
            deleteKey = new ArrayList<String>((cacheMap.size() / 2) + 1);
            cacheObject c = null;
            
            while (itr.hasNext()) {
                String key = (String) itr.next();
                c = cacheMap.get(key);
                if (c != null && (now > (timeToLive + c.lastAccessed))) {
                    deleteKey.add(key);
                }
            }
        }
        File deleted;
        for (String key : deleteKey) {
            synchronized (cacheMap) {
            	deleted=(File) cacheMap.get(key).value;
                cacheMap.remove(key);
                logger.info(deleted+" Removed from cache at Key" + key);
            }
            
            Thread.yield();
        }
    }
}