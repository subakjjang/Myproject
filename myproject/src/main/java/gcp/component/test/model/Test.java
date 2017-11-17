package gcp.component.test.model;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@Data
public class Test {
	
	private Long id;	
	 private String name;
	 private String modyId;
	 private Date modyDate;
	 private String instId;
	 private Date instDate;
}
