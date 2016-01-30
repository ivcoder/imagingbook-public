/*******************************************************************************
 * This software is provided as a supplement to the authors' textbooks on digital
 * image processing published by Springer-Verlag in various languages and editions.
 * Permission to use and distribute this software is granted under the BSD 2-Clause 
 * "Simplified" License (see http://opensource.org/licenses/BSD-2-Clause). 
 * Copyright (c) 2006-2015 Wilhelm Burger, Mark J. Burge. 
 * All rights reserved. Visit http://www.imagingbook.com for additional details.
 *  
 *******************************************************************************/
package Ch03_ImageJ_Introduction;

import ij.IJ;
import ij.ImagePlus;
import ij.plugin.PlugIn;
import ij.process.ImageProcessor;

public class My_Inverter_B implements PlugIn {

	public void run(String args) {
		ImagePlus im = IJ.getImage();
		
		if (im.getType() != ImagePlus.GRAY8) {
			IJ.error("8-bit grayscale image required"); 
			return;
		}
		
		ImageProcessor ip = im.getProcessor();
		int M = ip.getWidth();
		int N = ip.getHeight();

		// iterate over all image coordinates (u,v)
		for (int u = 0; u < M; u++) {
			for (int v = 0; v < N; v++) {
				int p = ip.get(u, v);
				ip.set(u, v, 255 - p);
			}
		}
		
		im.updateAndDraw();		// redraw the modified image
	}
}
