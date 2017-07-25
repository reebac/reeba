package container;
//import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class apc 

{
	private int vehicle_id;
	private long route;
	private long direction;
	private double recordTimestamp;
	@JsonProperty("OccupancyStatusEnum")
	private String occupancyStatusEnum;
	private long estimatedCount;

	public int getvehicle_id() 
	{
		return vehicle_id;
	}

	public void setvehicle_id(int vehicle_id) 
	{
		this.vehicle_id = vehicle_id;
	}
	
	
	public long getroute() 
	{
		return route;
	}

	public void setroute(long route) 
	{
		this.route = route;
	}
	
	public long getdirection() 
	{
		return direction;
	}

	public void setdirection(long direction) 
	{
		this.direction = direction;
	}
	
	public double getrecordTimestamp() 
	{
		return recordTimestamp;
	}

	public void setrecordTimestamp(double recordTimestamp) 
	{
		this.recordTimestamp = recordTimestamp;
	}
	

	public String getOccupancyStatusEnum() {
		return occupancyStatusEnum;
	}

	public void setOccupancyStatusEnum(String occupancyStatusEnum) {
		this.occupancyStatusEnum = occupancyStatusEnum;
	}

	public long getestimatedCount() 
	{
		return estimatedCount;
	}

	public void setestimatedCount(long estimatedCount) 
	{
		this.estimatedCount = estimatedCount;
	}
	

	
@Override
public String toString() 
{
    return "BUS [Vehicle ID =" + vehicle_id + ", Route =" + route + ", Direction =" + direction + ", recordTimestamp =" + recordTimestamp + ", OccupancyStatus =" + occupancyStatusEnum + ", Count =" + estimatedCount +"]";
}
}
