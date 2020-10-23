package com;

public class Test {
	public static void main(String[] args) {
		CPU cpu = new CPU();
		
		cpu.setSpeed(2200);
		cpu.setSize(88);
		
		HardDisk disk = new HardDisk();
		
		disk.setAmount(200);
		disk.setA(188);
		
		PC pc = new PC();
		pc.setCpu(cpu);
		pc.setDisk(disk);
		pc.show();
	}
	

}
