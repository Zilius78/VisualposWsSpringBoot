

package it.ziliani.xml.payment;

import javax.xml.bind.annotation.XmlRegistry;



@XmlRegistry
public class ObjectFactory {


   
  
    public ObjectFactory() {
		super();
	
	}


	public NewDataSet createNewDataSet() {
        return new NewDataSet();
    }

   
    public NewDataSet.PAGA createNewDataSetPAGA() {
        return new NewDataSet.PAGA();
    }

}
