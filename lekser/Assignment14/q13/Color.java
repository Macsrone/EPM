package Assignment14.q13;


import java.util.Arrays;
/**
* represents basic Color class example
*/

	public class Color {
//    rgb array with 3 ints is used to hold r,g,b values
		private int[] rgb = new int[3];
    /**
     * Available colors - ready with rgb code
     */
    public final static int[] WHITE     = new int[]{255, 255, 255};
    public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};
    public final static int[] GRAY      = new int[]{128, 128, 128};
    public final static int[] DARK_GRAY  = new int[]{64, 64, 64};
    public final static int[] BLACK     = new int[]{0, 0, 0};
    public final static int[] RED       = new int[]{255, 0, 0};
    public final static int[] PINK      = new int[]{255, 175, 175};
    public final static int[] ORANGE    = new int[]{255, 200, 0};
    public final static int[] YELLOW    = new int[]{255, 255, 0};
    public final static int[] GREEN     = new int[]{0, 255, 0};
    public final static int[] MAGENTA   = new int[]{255, 0, 255};
    public final static int[] CYAN      = new int[]{0, 255, 255};
    public final static int[] BLUE      = new int[]{0, 0, 255};
    public Color(int r, int g, int b){
      this. rgb[0]=r;
      this. rgb[1]=g;
      this. rgb[2]=b;
    }
    public Color() {
    	  this. rgb[0]=255;
    	  this. rgb[1]=255;
          this. rgb[2]=255;
    	 
    	 System.out.println("white");
    }
    public String toString() {
    	if (Arrays.equals(rgb,WHITE)) {
    		return "WHITE";
    	}
    	else if (Arrays.equals(rgb,LIGHT_GRAY)) {
    		return "LIGHT_GRAY";
    	}
    	else if (Arrays.equals(rgb,GRAY)) {
    		return "GRAY";
    	}
    	else if (Arrays.equals(rgb,RED)) {
    		return "RED";
    	}
    	else {
		return "n/a";
		}
    }
}