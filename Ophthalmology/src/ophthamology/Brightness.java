/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ophthamology;

 import java.awt.*;
import java.awt.image.*;
import com.jhlabs.image.TransferFilter; 
import java.io.File;

public class Brightness extends TransferFilter {

	private float brightness = 1.0f;
	private float contrast = 1.0f;
	
        public Brightness(){
        
        }
        public Brightness(float newBrightness){
            brightness = newBrightness;
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





