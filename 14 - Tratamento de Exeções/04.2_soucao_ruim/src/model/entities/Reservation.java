package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
		private Integer roomNumber;
		private Date checkIn;
		private Date checkOut;
		
		// O static serve para que n�o seja instanciado um novo SimpleDateFormat para cada objeto Reservation que a aplica��o tiver
		private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
			super();
			this.roomNumber = roomNumber;
			this.checkIn = checkIn;
			this.checkOut = checkOut;
		}

		public Integer getRoomNumber() {
			return roomNumber;
		}

		public void setRoomNumber(Integer roomNumber) {
			this.roomNumber = roomNumber;
		}

		public Date getCheckIn() {
			return checkIn;
		}

		public Date getCheckOut() {
			return checkOut;
		}
		
		public long duration() {
			long diff = checkOut.getTime() - checkIn.getTime();
			return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
					
		}
		
		public void updateDates(Date checkIn, Date checkOut) { 
			this.checkIn = checkIn;
			this.checkOut = checkOut;
		}
		
		@Override
		public String toString() {
			return "Room "
					+ roomNumber
					+ ", check-in: "
					+ sdf.format(this.checkIn)
					+ ", check-Out: "
					+ sdf.format(this.checkOut)
					+ ", "
					+ this.duration()
					+ " nights";
		}
}
