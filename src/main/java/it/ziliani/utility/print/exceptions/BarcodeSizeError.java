package it.ziliani.utility.print.exceptions;

public class BarcodeSizeError extends Exception {

   /**
	 * 
	 */
	private static final long serialVersionUID = -5871776225289413182L;

public BarcodeSizeError() {
      super();
   }

   public BarcodeSizeError(String message) {
      super(message);
   }
}
