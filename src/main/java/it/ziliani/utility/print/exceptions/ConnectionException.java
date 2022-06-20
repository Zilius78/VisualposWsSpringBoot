package it.ziliani.utility.print.exceptions;

public class ConnectionException extends Exception {
   /**
	 * 
	 */
	private static final long serialVersionUID = -6358403537646131966L;

public ConnectionException() {
   }

   public ConnectionException(String message) {
      super(message);
   }

   public ConnectionException(String message, Throwable cause) {
      super(message, cause);
   }
}
