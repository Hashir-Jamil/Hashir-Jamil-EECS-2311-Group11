package drums;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "time")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder= {"beats","beatType"})
public class Time {
	
	
	@XmlElement
	int beats;
	
	@XmlElement(name = "beat-type")
	int beatType;
	
	public Time() {
		super();
		this.beats = 4;
		this.beatType = 4;
	}

	public Time(int beats, int beatType) {
		super();
		this.beats = beats;
		this.beatType = beatType;
	}
	
	public Time(Time t1) {
		super();
		t1.beats = beats;
		t1.beatType = beatType;
	}

	public int getBeats() {
		return beats;
	}

	public void setBeats(int beats) {
		this.beats = beats;
	}

	public int getBeatType() {
		return beatType;
	}

	public void setBeatType(int beatType) {
		this.beatType = beatType;
	}
	
	
}
