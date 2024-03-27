package reconhecimentoFacial.main;

import org.opencv.core.Core;

public class ReconhecimentoFacial {

	public static void main(String[] args) {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		System.out.println("Hello world!");

	}

}
