package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	
		private Integer roomNumber;
		private Date checkIn;
		private Date checkOut;
		
		// O static serve para que n�o seja instanciado um novo SimpleDateFormat para cada objeto Reservation que a aplica��o tiver
		private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
			if(!checkOut.after(checkIn)) {
				throw new DomainException("Error in reservation: Check-out date must be after check-in date");
			}
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
		
		public void updateDates(Date checkIn, Date checkOut) throws DomainException { 
			Date now = new Date(); // Data atual
			
			if (checkIn.before(now) || checkOut.before(now)) {
				// Serve para indicar um erro no argumento do m�todo
				throw new DomainException("Error in reservation: Reservation dates for update must be future dates");
			}
			if (!checkOut.after(checkIn)) {
				throw new DomainException("Error in reservation: Check-out date must be after check-in date");
			}
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
