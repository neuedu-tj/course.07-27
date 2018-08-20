package extra.commons;



import org.apache.commons.collections.map.LRUMap;


public class Collection_06_LRUMap {

	public static void main(String[] args) {
	
		LRUMap cache = new LRUMap(5);

		//5 stock prices
		cache.put(" MSFT ", new Float(0.03));
		cache.put(" TSC ", new Float(0.001));
		cache.put(" LU ", new Float(23.30));
		cache.put(" CSCO ", new Float(242.20));
		cache.put(" P ", new Float(10.23));


		cache.put("Gold", new Float(203.20));
		
		
		
		System.out.println(cache);
	}
}
