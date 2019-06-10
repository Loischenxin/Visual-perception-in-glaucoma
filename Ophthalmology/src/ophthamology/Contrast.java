package ophthamology;

 import java.awt.*;
import java.awt.image.*;
import com.jhlabs.image.TransferFilter; 
import java.io.File;

public class Contrast extends TransferFilter {

	private float brightness = 1.0f;
	private float contrast = 1.0f;
	
        public Contrast(){
        
        }
        public Contrast(float newcontrast){
            contrast = newcontrast;
        }
        
        
	protected float transferFunction( float f ) {
		f = f*brightness;
		f = (f-0.5f)*contrast+0.5f;
		return f;
	}

    /**
     * Set the filter brightness.
     * @param brightness the brightness in the range 0 to 1
     * @min-value 0
     * @max-value 0
     * @see #getBrightness
     */
	public void setBrightness(float brightness) {
		this.brightness = brightness;
		initialized = false;
	}
	
    /**
     * Get the filter brightness.
     * @return the brightness in the range 0 to 1
     * @see #setBrightness
     */
	public float getBrightness() {
		return brightness;
	}

    /**
     * Set the filter contrast.
     * @param contrast the contrast in the range 0 to 1
     * @min-value 0
     * @max-value 0
     * @see #getContrast
     */
	public void setContrast(float contrast) {
		this.contrast = contrast;
		initialized = false;
	}
	
    /**
     * Get the filter contrast.
     * @return the contrast in the range 0 to 1
     * @see #setContrast
     */
	public float getContrast() {
		return contrast;
	}

	public String toString() {
		return "Colors/Contrast...";
	}

    BufferedImage changeContrast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}




