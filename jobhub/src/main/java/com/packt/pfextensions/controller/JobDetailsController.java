package com.packt.pfextensions.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.packt.pfextensions.model.JobDetails;
import com.packt.pfextensions.model.JobPost;
import com.packt.pfextensions.model.SkillsDetails;

	@ManagedBean
	@ViewScoped
	public class JobDetailsController implements Serializable {

		private static final long serialVersionUID = 20111120L;

		private List<JobPost> jobPosts;
		private int currentLevel = 1;
		private List<JobPost> filteredPosts;
		private String searchText;

		public JobDetailsController() {
			jobPosts = new ArrayList<JobPost>();

			for(int i=0;i<4;i++){
				loadJobPosts();
			}
		}

		public void loadJobPosts(){

				// SrArchitect
				List<JobDetails> JobDetailsArchList = new ArrayList<JobDetails>();
				JobDetails jobDetails = new JobDetails("Java Domain","10","B11-Architect", getSkillsDetails("Java"));
				JobDetailsArchList.add(jobDetails);
				jobDetails = new JobDetails(".NET Domain","8","B12-Architect", getSkillsDetails(".NET"));
				JobDetailsArchList.add(jobDetails);
				jobDetails = new JobDetails("DB Domain","12","A14-Architect",  getSkillsDetails("DB"));
				JobDetailsArchList.add(jobDetails);
				jobDetails = new JobDetails("SAP Domain", "14", "B13-Architect",  getSkillsDetails("SAP"));
				JobDetailsArchList.add(jobDetails);
				jobPosts.add(new JobPost("SrArchitect","Architectural designs","US",false, JobDetailsArchList));

				//SrDeveloper
				List<JobDetails> JobDetailsSrDevList = new ArrayList<JobDetails>();
				JobDetails jobDetailsSrDev = new JobDetails("Java Domain","10","B11-Architect", getSkillsDetails("Java"));
				JobDetailsSrDevList.add(jobDetailsSrDev);
				jobDetailsSrDev = new JobDetails(".NET Domain","8","B12-Architect", getSkillsDetails(".NET"));
				JobDetailsSrDevList.add(jobDetailsSrDev);
				jobDetailsSrDev = new JobDetails("DB Domain","12","A14-Architect",  getSkillsDetails("DB"));
				JobDetailsSrDevList.add(jobDetailsSrDev);
				jobDetailsSrDev = new JobDetails("SAP Domain", "15", "B13-Architect",  getSkillsDetails("SAP"));
				JobDetailsSrDevList.add(jobDetailsSrDev);
				jobPosts.add(new JobPost("SrDeveloper","Designs and developement","UK",true, JobDetailsSrDevList));

				//SrLeadDeveloper
				List<JobDetails> jobDetailsLeadDevList = new ArrayList<JobDetails>();
				JobDetails jobDetailsLeadDev = new JobDetails("Java Domain","10","B11-Architect", getSkillsDetails("Java"));
				jobDetailsLeadDevList.add(jobDetailsLeadDev);
				jobDetails = new JobDetails(".NET Domain","8","B12-Architect", getSkillsDetails(".NET"));
				jobDetailsLeadDevList.add(jobDetailsLeadDev);
				jobDetails = new JobDetails("DB Domain","12","A14-Architect",  getSkillsDetails("DB"));
				jobDetailsLeadDevList.add(jobDetailsLeadDev);
				jobDetails = new JobDetails("SAP Domain", "12", "B13-Architect",  getSkillsDetails("SAP"));
				jobDetailsLeadDevList.add(jobDetailsLeadDev);
				jobPosts.add(new JobPost("SrArchitect","R&D and management activities","US",true, jobDetailsLeadDevList));
				
				// Software Developer
				List<JobDetails> JobDetailsDevList = new ArrayList<JobDetails>();
				JobDetails jobDetailsDev = new JobDetails("Java Domain","10","B11-Architect", getSkillsDetails("Java"));
				JobDetailsArchList.add(jobDetailsDev);
				jobDetailsDev = new JobDetails(".NET Domain","8","B12-Architect", getSkillsDetails(".NET"));
				JobDetailsArchList.add(jobDetailsDev);
				jobDetailsDev = new JobDetails("DB Domain","12","A14-Architect",  getSkillsDetails("DB"));
				JobDetailsArchList.add(jobDetailsDev);
				jobDetailsDev = new JobDetails("SAP Domain", "14", "B13-Architect",  getSkillsDetails("SAP"));
				JobDetailsArchList.add(jobDetailsDev);
				jobPosts.add(new JobPost("Software Developer","Application developement","US",false, JobDetailsArchList));
				
		}
		

		
		public String getSearchText() {
			return searchText;
		}

		public void setSearchText(String searchText) {
			this.searchText = searchText;
		}

		public List<JobPost> getFilteredPosts() {
			return filteredPosts;
		}

		public void setFilteredPosts(List<JobPost> filteredPosts) {
			this.filteredPosts = filteredPosts;
		}

		public List<JobPost> getJobPosts() {
			return jobPosts;
		}



		public int getCurrentLevel() {
			return currentLevel;
		}

		public void setCurrentLevel(int currentLevel) {
			this.currentLevel = currentLevel;
		}

		private List<SkillsDetails> getSkillsDetails(String title) {
			List<SkillsDetails> skillDetails = new ArrayList<SkillsDetails>();

			if(title.equalsIgnoreCase("JAVA")){
				skillDetails.add(new SkillsDetails("JSF","10","OCJP","Advanced"));
				skillDetails.add(new SkillsDetails("Spring","8","not required","Excellant"));
				skillDetails.add(new SkillsDetails("Struts","12","Any","Advanced"));

			}
			if(title.equalsIgnoreCase(".NET")){
				skillDetails.add(new SkillsDetails("VB.Net","10","Not required","Advanced"));
				skillDetails.add(new SkillsDetails("WPF","8","not required","Excellant"));
				skillDetails.add(new SkillsDetails("WCF","12","Any","Advanced"));
				skillDetails.add(new SkillsDetails("SilverLight","12","Any","Advanced"));


			}
			if(title.equalsIgnoreCase("DB")){
				skillDetails.add(new SkillsDetails("Oracle","10","OCP","Advanced"));
				skillDetails.add(new SkillsDetails("MySQL","8","not required","Excellant"));
				skillDetails.add(new SkillsDetails("SQL Server","12","Any","Advanced"));

			}
			if(title.equalsIgnoreCase("SAP")){
				skillDetails.add(new SkillsDetails("ABAP","10","OCP","Advanced"));
				skillDetails.add(new SkillsDetails("CRM","8","not required","Excellant"));
				skillDetails.add(new SkillsDetails("eCATT","12","Any","Advanced"));

			}
			
			
			return skillDetails;
		}
	}
	            
