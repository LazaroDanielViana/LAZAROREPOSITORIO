package modelBloco0;

import java.util.ArrayList;
import java.util.List;

import efdUtil.RegexL;

public class R0001 {

	String REG_R0001;
	byte IND_MOV_R0001;

	R0005 r0005 = new R0005();
	List<R0015> listR0015 = new ArrayList<>();
	R0100 r0100 = new R0100();
	List<R0150> listR0150 = new ArrayList<>();
	List<R0190> listR0190 = new ArrayList<>();
	List<R0200> listR0200 = new ArrayList<>();
	List<R0300> listR0300 = new ArrayList<>();
	List<R0400> listR0400 = new ArrayList<>();
	List<R0450> listR0450 = new ArrayList<>();
	List<R0460> listR0460 = new ArrayList<>();
	List<R0500> listR0500 = new ArrayList<>();
	List<R0600> listR0600 = new ArrayList<>();

	public String getREG_R0001() {
		return REG_R0001;
	}

	public void setREG_R0001(String rEG_R0001) {
		REG_R0001 = rEG_R0001;
	}

	public byte getIND_MOV_R0001() {
		return IND_MOV_R0001;
	}

	public void setIND_MOV_R0001(byte iND_MOV_R0001) {
		IND_MOV_R0001 = iND_MOV_R0001;
	}

	public R0005 getR0005() {
		return r0005;
	}

	public void setR0005(R0005 r0005) {
		this.r0005 = r0005;
	}

	public List<R0015> getListR0015() {
		return listR0015;
	}

	public void setListR0015(List<R0015> listR0015) {
		this.listR0015 = listR0015;
	}

	public R0100 getR0100() {
		return r0100;
	}

	public void setR0100(R0100 r0100) {
		this.r0100 = r0100;
	}

	public List<R0150> getListR0150() {
		return listR0150;
	}

	public void setListR0150(List<R0150> listR0150) {
		this.listR0150 = listR0150;
	}

	public List<R0190> getListR0190() {
		return listR0190;
	}

	public void setListR0190(List<R0190> listR0190) {
		this.listR0190 = listR0190;
	}

	public List<R0200> getListR0200() {
		return listR0200;
	}

	public void setListR0200(List<R0200> listR0200) {
		this.listR0200 = listR0200;
	}

	public List<R0300> getListR0300() {
		return listR0300;
	}

	public void setListR0300(List<R0300> listR0300) {
		this.listR0300 = listR0300;
	}

	public List<R0400> getListR0400() {
		return listR0400;
	}

	public void setListR0400(List<R0400> listR0400) {
		this.listR0400 = listR0400;
	}

	public List<R0450> getListR0450() {
		return listR0450;
	}

	public void setListR0450(List<R0450> listR0450) {
		this.listR0450 = listR0450;
	}

	public List<R0460> getListR0460() {
		return listR0460;
	}

	public void setListR0460(List<R0460> listR0460) {
		this.listR0460 = listR0460;
	}

	public List<R0500> getListR0500() {
		return listR0500;
	}

	public void setListR0500(List<R0500> listR0500) {
		this.listR0500 = listR0500;
	}

	public List<R0600> getListR0600() {
		return listR0600;
	}

	public void setListR0600(List<R0600> listR0600) {
		this.listR0600 = listR0600;
	}

	public R0001() {
	}

	public R0001(List<String> strs1) {
		this.setREG_R0001(strs1.get(0));
		if (strs1.get(1).length() >= 1)
			this.setIND_MOV_R0001(Byte.parseByte(strs1.get(1)));
	}

}
