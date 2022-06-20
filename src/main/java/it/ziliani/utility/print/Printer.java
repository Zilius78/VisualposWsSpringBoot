package it.ziliani.utility.print;

public interface Printer {
   void open();

   void write(byte[] command);

   void close();
}
