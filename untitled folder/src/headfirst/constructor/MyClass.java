package headfirst.constructor;

import java.util.LinkedList;
import java.util.Queue;

import java.lang.Integer;

class MyClass {
	public static void find_city(Integer n, Integer home_city, Integer dest_city, Integer[] firstCityRoads, Integer[] secondCityRoads) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Boolean[] visitedCity = new Boolean[n];
		for(int i=0;i<n;i++)
			visitedCity[i] = false;
		int finalNumOfRoads = 0;
		finalNumOfRoads = breadFirthSearch(queue, visitedCity, firstCityRoads, secondCityRoads, home_city, dest_city, finalNumOfRoads);
		while(!queue.isEmpty()) {
			Integer integer = (Integer) queue.remove();
			finalNumOfRoads = breadFirthSearch(queue, visitedCity, firstCityRoads, secondCityRoads, home_city, dest_city, finalNumOfRoads);
		}
		System.out.println(finalNumOfRoads);
	}
	
	public static int breadFirthSearch(Queue queue, Boolean[] visitedCity, Integer[] firstCityRoads, Integer[] secondCityRoads,
			Integer home_city, Integer dest_city, int finalNumOfRoads) {
		for(int i=0;i<firstCityRoads.length;i++) {
			if(firstCityRoads[i].intValue() == home_city.intValue()) {
				if(secondCityRoads[i].intValue() == dest_city.intValue()) {
					return finalNumOfRoads;
				}
				if(visitedCity[i] == false) {
					queue.add(secondCityRoads[i]);
					visitedCity[i] = true;
				}
			}
		}
		return finalNumOfRoads;
	}
	
}
	
//		public void bfs() {
//			// BFS uses Queue data structure
//			Queue<Integer> queue = new LinkedList<Integer>();
//			queue.add(this.rootNode);
//			rootNode.visited = true;
//			while(!queue.isEmpty()) {
//				Node node = (Node)queue.remove();
//				Node child=null;
//				while((child=getUnvisitedChildNode(node))!=null) {
//					child.visited=true;
//					queue.add(child);
//				}
//			}
//		}
//	 
	
//	public static void maxdiff(Integer[] v) {
//		int size = v.length;
//		generateSubsequences(size);
//	}
//	
//	public static void generateSubsequences(int size) {
//		for(int i=0;i<(size-1);i++) {
//			System.out.print("Left index = " + i);
//			System.out.print(" Right index = ");
//			for(int j=i+1;j<size;j++) {
//				System.out.print(j + ",");
//			}
//			System.out.println();
//		}
//	}
//	
//	public static int diffPrint(Integer[] left, Integer[] right) {
//		int leftSum = 0;
//		for(int i=0;i<left.length;i++) {
//			leftSum = leftSum+left[i];
//		}
//		int rightSum = 0;
//		for(int j=0;j<right.length;j++) {
//			rightSum = rightSum+left[j];
//		}
//		return leftSum - rightSum;
//	}
//	
//	public static void main(String[] args) {
//		new MyClass().maxdiff(new Integer[] {3, -5, 1, -2, 8, -2, 3, -2, 1});
//	}
//	

	
//    public static void find_deviation(Integer[] v, Integer d) {
//      Integer maxMedian = 0;
//      int numOfCombinations = v.length - d + 1;
//      for(int i=0; i<numOfCombinations;i++) {
//        Integer[] s = new Integer[d];
//        for(int j=0;j<d;j++) {
//            s[j] = v[i+j];
//        }
//        int median = 0;
//        for (int x=0;x<(d-1);x++) {
//        	for(int y=x+1;y<d;y++) {
//        		int medianTemp = Math.abs(s[x] - s[y]);
//        		if (median < medianTemp) {
//        			median = medianTemp;
//        		}
//        	}
//        }
//        if (maxMedian < median) {
//        	maxMedian = median;
//        }
//      }
//      System.out.println(maxMedian);
//    }
//    
//    public static void main(String[] args) {
//    	new MyClass().find_deviation(new Integer[] {6,9,4,7,4,1}, 3);
//    }

//}
