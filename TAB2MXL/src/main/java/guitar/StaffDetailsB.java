package guitar;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "staff-details")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder= {"staffLines", "s1", "s2", "s3", "s4"})

public class StaffDetailsB{
	
	@XmlElement(name = "staff-lines")
	int staffLines;
	
	@XmlElement (name = "staff-tuning")
	StaffTuning s1;
	
	@XmlElement(name = "staff-tuning")
	StaffTuning s2 ;
	
	@XmlElement(name = "staff-tuning")
	StaffTuning s3;
	
	@XmlElement(name = "staff-tuning")
	StaffTuning s4;
	
	public StaffDetailsB() {
		staffLines = 6;
		s1 = new StaffTuning(1, "E", 1);
		s2 = new StaffTuning(2, "A", 1);
		s3 = new StaffTuning(3, "D", 2);
		s4 = new StaffTuning(4, "G", 2);
	}
	
	public StaffDetailsB(List<String> stringTune) {
		staffLines = 6;
		s1 = new StaffTuning(1, stringTune.get(0), 1);
		s2 = new StaffTuning(2, stringTune.get(1), 1);
		s3 = new StaffTuning(3, stringTune.get(2), 2);
		s4 = new StaffTuning(4, stringTune.get(3), 2);
	}

	public int getStaffLines() {
		return staffLines;
	}

	public void setStaffLines(int staffLines) {
		this.staffLines = staffLines;
	}

	public StaffTuning getS1() {
		return s1;
	}

	public void setS1(StaffTuning s1) {
		this.s1 = s1;
	}

	public StaffTuning getS2() {
		return s2;
	}

	public void setS2(StaffTuning s2) {
		this.s2 = s2;
	}

	public StaffTuning getS3() {
		return s3;
	}

	public void setS3(StaffTuning s3) {
		this.s3 = s3;
	}

	public StaffTuning getS4() {
		return s4;
	}

	public void setS4(StaffTuning s4) {
		this.s4 = s4;
	}

//	@Override 
//	public String toString() {
//	//	return staffLines + " "+ s1 + s2 + s3 + s4 + s5 + s6;
//	}
//	
	
}

