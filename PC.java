package com;

public class PC {
	
	CPU cpu;
	HardDisk disk;
	
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public void setDisk(HardDisk disk) {
		this.disk = disk;
	}
	void show() {
		// TODO Auto-generated method stub
		System.out.println("CPU Speed:"+cpu.getSpeed());
		System.out.println("CPU Size:"+cpu.getSize());
		System.out.println("Hard Disk:"+disk.getAmount());
		System.out.println("Hard A:"+disk.getA());
	}

}
