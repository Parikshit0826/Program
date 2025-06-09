package class1;

import java.util.LinkedList;
import java.util.Queue;

class PatientData {
	private String name;
	private int age;
	private String phno;
	private int heartRate;
	private int gucoseLevel;
	private String symptoms;

	public PatientData(String name, int age, String phno, int heartRate, int gucoseLevel, String symptoms) {
		super();
		this.name = name;
		this.age = age;
		this.phno = phno;
		this.heartRate = heartRate;
		this.gucoseLevel = gucoseLevel;
		this.symptoms = symptoms;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPhno() {
		return phno;
	}

	public int getHeartRate() {
		return heartRate;
	}

	public int getGucoseLevel() {
		return gucoseLevel;
	}

	public String getSymptoms() {
		return symptoms;
	}

	@Override
	public String toString() {
		return "PaitientData [name=" + name + ", age=" + age + ", phno=" + phno + ", heartRate=" + heartRate
				+ ", gucoseLevel=" + gucoseLevel + ", symptoms=" + symptoms + "]";
	}

}

class PatientMonitering {
	private Queue<PatientData> queue = new LinkedList<PatientData>();

	public void addPatient(PatientData p1) {
		queue.add(p1);
		System.out.println(p1.toString());
	}

	public void consulting() throws InterruptedException {
		while (!queue.isEmpty()) {
			PatientData p1 = queue.poll();
			System.out.println("Name: " + p1.getName());
			System.out.println("Age: " + p1.getAge());
			System.out.println("Ph No: " + p1.getPhno());

			System.out.println("Heart RAte: " + p1.getHeartRate() + " -> " + getHeartRate(p1.getHeartRate()));
			System.out.println("Glucose Level: " + p1.getGucoseLevel() + " -> " + getGlucoseLevel(p1.getGucoseLevel()));
			System.out.println("Symptoms: " + p1.getSymptoms());
			System.out.println("****************************************************************");

		}
		System.out.println("All consulting is done...!");
	}

	public String getHeartRate(int heartRate) throws InterruptedException {
		Thread.sleep(5000);
		if (heartRate < 60 || heartRate > 100) {
			return "!Abnormal Heart Rate detect";
		} else {
			return "Normal Heart Rate detect";
		}
	}

	public String getGlucoseLevel(int glucose) throws InterruptedException {
		Thread.sleep(5000);
		if (glucose < 70 || glucose > 100) {
			return "!Abnormal glucose rate detect";
		} else {
			return "Normal glucose rate detect";
		}

	}
}

public class MainClass3 {

	public static void main(String[] args) throws InterruptedException {
		PatientMonitering p1 = new PatientMonitering();
		p1.addPatient(new PatientData("Abc1", 41, "961252617", 59, 80, "Diabetes"));
		p1.addPatient(new PatientData("Abc4", 48, "961252617", 80, 55, "Cancer"));
		p1.addPatient(new PatientData("Abc2", 55, "961252617", 100, 100, "Stroke"));
		p1.addPatient(new PatientData("Abc3", 71, "961252617", 110, 110, "COVID-19"));
		System.out.println("****************************************************************");
		p1.consulting();

	}
}
