package it.ziliani.utility.print.exceptions;

public class QRCodeException extends Exception{

	private static final long serialVersionUID = 7471352424378849929L;

public QRCodeException() {
      super();
   }

   public QRCodeException(String message) {
      super(message);
   }

   public QRCodeException(String message, Throwable cause) {
      super(message, cause);
   }
}