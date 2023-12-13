package com.isc.cse.promotion.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import java.io.Serializable;

@Entity
@Table(name = "carrer")
public class Carrer implements Serializable {
	@Id
	@Column(length = 15)
	private String studyProgram;

	@Column(length = 2, nullable = false)
	private String extension;

	@Column(length = 10, nullable = false)
	private String phone;

	@Column(length = 100, nullable = false)
	private String email;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String studyGridUrl;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String chartUrl;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String mission;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String vision;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String programPurpose;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String actionField;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String admissionProfile;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String graduationProfile;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String snFacebook;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String snInstagram;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String snLinkedin;

	public String getStudyProgram() {
		return studyProgram;
	}

	public void setStudyProgram(String studyProgram) {
		this.studyProgram = studyProgram;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStudyGridUrl() {
		return studyGridUrl;
	}

	public void setStudyGridUrl(String studyGridUrl) {
		this.studyGridUrl = studyGridUrl;
	}

	public String getChartUrl() {
		return chartUrl;
	}

	public void setChartUrl(String chartUrl) {
		this.chartUrl = chartUrl;
	}

	public String getMission() {
		return mission;
	}

	public void setMission(String mision) {
		this.mission = mision;
	}

	public String getVision() {
		return vision;
	}

	public void setVision(String vision) {
		this.vision = vision;
	}

	public String getProgramPurpose() {
		return programPurpose;
	}

	public void setProgramPurpose(String programPurpose) {
		this.programPurpose = programPurpose;
	}

	public String getActionField() {
		return actionField;
	}

	public void setActionField(String actionField) {
		this.actionField = actionField;
	}

	public String getAdmissionProfile() {
		return admissionProfile;
	}

	public void setAdmissionProfile(String admissionProfile) {
		this.admissionProfile = admissionProfile;
	}

	public String getGraduationProfile() {
		return graduationProfile;
	}

	public void setGraduationProfile(String graduationProfile) {
		this.graduationProfile = graduationProfile;
	}

	public String getSnFacebook() {
		return snFacebook;
	}

	public void setSnFacebook(String snFacebook) {
		this.snFacebook = snFacebook;
	}

	public String getSnInstagram() {
		return snInstagram;
	}

	public void setSnInstagram(String snInstagram) {
		this.snInstagram = snInstagram;
	}

	public String getSnLinkedin() {
		return snLinkedin;
	}

	public void setSnLinkedin(String snLinkedin) {
		this.snLinkedin = snLinkedin;
	}

	private static final long serialVersionUID = 1L;
}
