
public class FMRadio {
		// TODO Auto-generated method stub
	boolean status;
	int volume;
	private double frequency;
    final int MIN_VOLUME = 0;
    final int MAX_VOLUME = 40;
    final double MIN_MHZ = 88;
    final double MAX_MHZ = 108;
    
	
	
	public FMRadio(boolean rStatus, int rVolume, double rFrequency){
		status = rStatus;
		
		if(rVolume >= MIN_VOLUME && rVolume <= MAX_VOLUME) { 
			volume = rVolume;
	    }
		if(rFrequency >= MIN_MHZ && rFrequency <= MAX_MHZ) { 
				frequency = rFrequency;
		}
	}
	
	
	public FMRadio() {
	}
	
	
	public void setStatus(boolean onOff) {
		status = onOff;
		
	
//		if(status = true) {
//			status = false;
//		}else {
//			status = true;
//		}
	}
	
	
	public void increaseVolume(){ //is this supposed to take parameters 
	  if(status = true && volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
		  volume++;
	  }
	}
	
	public void decreaseVolume(){ //is this supposed to take parameters 
		  if(status = true && volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
			  volume--;
		  }
	}
	
	public void setVolume(int newVol){ 
	  if(status = true && volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
		   volume = newVol;
		}
	}	


	public int getVolume(){
	 return volume;
	}
	
	public void setFrequency(double value) {
	    if(status = true && frequency >= MIN_MHZ && frequency <= MAX_MHZ) { 
		  frequency = value; 
	    }
	}
	
	public void increaseFrequency() {
		if(status = true && frequency >= MIN_MHZ && frequency <= MAX_MHZ){
			frequency += 0.1; 
		}
		frequency =  Math.round(frequency *10.0)/10.0;
	}
	public void decreaseFrequency() {
		if(status = true && frequency >= MIN_MHZ && frequency <= MAX_MHZ){
			frequency -= 0.1; 
		}
		frequency =  Math.round(frequency *10.0)/10.0;
	}
	
	public double getFrequency(){
		 return frequency;
	}
	
	
	
	public String toString() {
		String onOff;
		if(status==true) {
			onOff = "On";
		}else {
			onOff = "Off";
		}
		return  "Status: " + onOff + '\n' + "Volume: " + volume +  '\n' + "Frequency: " + frequency  +  '\n' ; 
		

	}
	
	
	
	
	}


