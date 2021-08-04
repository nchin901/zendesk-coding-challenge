package zendesk_coding_challenge;


import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ticket {
	private boolean allow_attachments;
	private boolean allow_channelback;
	private long assignee_id;
	private long brand_id;
	private String [] fields;
	private long [] collaborator_ids;
	private long [] collaborator;
	private String created_at;
	private String [] custom_fields;
	private String description;
	private String due_at;
	private long [] email_cc_ids;
	private String external_id;
	private long [] follower_ids;
	private long[] followup_ids;
	private long forum_topic_id;
	private long group_id;
	private boolean has_incidents;
	private long id;
	private boolean is_public;
	private long [] macro_ids;
	private long organization_id;
	private String priority;
	private long problem_id;
	private String raw_subject;
	private String recipient;
	private long requester_id;
	private Object satisfaction_rating;
	private long [] sharing_agreement_ids;
	private String status;
	private String subject;
	private long submitter_id;
	private String [] tags;
	private long ticket_form_id;
	private String type;
	private String updated_at;
	private String url;
	private Object via;
	private long via_followup_source_id;
	private ArrayList<ticket> tickets;
	public ticket() {
		// TODO Auto-generated constructor stub
	}
	public ticket(String url,
			int id,
			String external_id,
			Object via,
			String created_at,
			String updated_at,
			String type,
			String subject,
			String raw_subject,
			String description,
			String priority,
			String status,
			String recipient,
			long requester_id,
			long submitter_id,
			long assignee_id,
			long organization_id,
			long group_id,
			long [] collaborator_ids,
			long [] follower_ids,
			long[] email_cc_ids,
			long forum_topic_id,
			long problem_id,
			boolean has_incidents,
			boolean is_public,
			String due_at,
			String [] tags,
			String [] custom_fields,
			Object satisfaction_rating,
			long [] sharing_agreement_ids,
			String [] fields,
			long[] followup_ids,
			long ticket_form_id,
			long brand_id,
			boolean allow_channelback,
			boolean allow_attachments) {
		this.allow_attachments = allow_attachments;
		this.allow_channelback = allow_channelback;
		this.assignee_id = assignee_id;
		this.brand_id = brand_id;
		this.collaborator_ids= collaborator_ids;
		this.setFields(fields);
		this.created_at = created_at;
		//this.custom_fields = custom_fields;
		this.description = description;
		this.due_at = due_at;
		this.email_cc_ids = email_cc_ids;
		this.external_id = external_id;
		this.follower_ids = follower_ids;
		this.followup_ids = followup_ids;
		this.forum_topic_id = forum_topic_id;
		this.group_id = group_id;
		this.has_incidents = has_incidents;
		this.id = id;
		this.is_public = is_public;
		this.organization_id = organization_id;
		this.priority = priority;
		this.problem_id = problem_id;
		this.raw_subject = raw_subject;
		this.recipient = recipient;
		this.requester_id = requester_id;
		this.satisfaction_rating = satisfaction_rating;
		this.sharing_agreement_ids = sharing_agreement_ids;
		this.status = status;
		this.subject = subject;
		this.submitter_id = submitter_id;
		this.tags = tags;
		this.ticket_form_id = ticket_form_id;
		this.type = type;
		this.updated_at = updated_at;
		this.url = url;
		this.via = via;
		
	}
	@JsonProperty("tickets")
	ArrayList<ticket> getTickets() {
		  return tickets;
		} 
	public boolean isAllow_attachments() {
		return allow_attachments;
	}
	public void setAllow_attachments(boolean allow_attachments) {
		this.allow_attachments = allow_attachments;
	}
	public boolean isAllow_channelback() {
		return allow_channelback;
	}
	public void setAllow_channelback(boolean allow_channelback) {
		this.allow_channelback = allow_channelback;
	}
	public long getAssignee_id() {
		return assignee_id;
	}
	public void setAssignee_id(long assignee_id) {
		this.assignee_id = assignee_id;
	}
	public long getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(long brand_id) {
		this.brand_id = brand_id;
	}
	public long[] getCollaborator_ids() {
		return collaborator_ids;
	}
	public void setCollaborator_ids(long[] collaborator_ids) {
		this.collaborator_ids = collaborator_ids;
	}
	public long[] getCollaborator() {
		return collaborator;
	}
	public void setCollaborator(long[] collaborator) {
		this.collaborator = collaborator;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String[] getCustom_field() {
		return custom_fields;
	}
	public void setCustom_field(String[] custom_fields) {
		this.custom_fields = custom_fields;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDue_at() {
		return due_at;
	}
	public void setDue_at(String due_at) {
		this.due_at = due_at;
	}
	public long[] getEmail_cc_ids() {
		return email_cc_ids;
	}
	public void setEmail_cc_ids(long[] email_cc_ids) {
		this.email_cc_ids = email_cc_ids;
	}
	public String getExternal_id() {
		return external_id;
	}
	public void setExternal_id(String external_id) {
		this.external_id = external_id;
	}
	public long[] getFollower_ids() {
		return follower_ids;
	}
	public void setFollower_ids(long[] follower_ids) {
		this.follower_ids = follower_ids;
	}
	public long[] getFollowup_ids() {
		return followup_ids;
	}
	public void setFollowup_ids(long[] followup_ids) {
		this.followup_ids = followup_ids;
	}
	public long getForum_topic_id() {
		return forum_topic_id;
	}
	public void setForum_topic_id(int forum_topic_id) {
		this.forum_topic_id = forum_topic_id;
	}
	public long getGroup_id() {
		return group_id;
	}
	public void setGroup_id(long group_id) {
		this.group_id = group_id;
	}
	public boolean isHas_incidents() {
		return has_incidents;
	}
	public void setHas_incidents(boolean has_incidents) {
		this.has_incidents = has_incidents;
	}
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isIs_public() {
		return is_public;
	}
	public void setIs_public(boolean is_public) {
		this.is_public = is_public;
	}
	public long[] getMacro_ids() {
		return macro_ids;
	}
	public void setMacro_ids(long[] macro_ids) {
		this.macro_ids = macro_ids;
	}
	public long getOrganization_id() {
		return organization_id;
	}
	public void setOrganization_id(long organization_id) {
		this.organization_id = organization_id;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public long getProblem_id() {
		return problem_id;
	}
	public void setProblem_id(int problem_id) {
		this.problem_id = problem_id;
	}
	public String getRaw_subject() {
		return raw_subject;
	}
	public void setRaw_subject(String raw_subject) {
		this.raw_subject = raw_subject;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public long getRequester_id() {
		return requester_id;
	}
	public void setRequester_id(long requester_id) {
		this.requester_id = requester_id;
	}
	public Object getSatisfaction_rating() {
		return satisfaction_rating;
	}
	public void setSatisfaction_rating(Object satisfaction_rating) {
		this.satisfaction_rating = satisfaction_rating;
	}
	public long[] getSharing_agreement_ids() {
		return sharing_agreement_ids;
	}
	public void setSharing_agreement_ids(long[] sharing_agreement_ids) {
		this.sharing_agreement_ids = sharing_agreement_ids;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public long getSubmitter_id() {
		return submitter_id;
	}
	public void setSubmitter_id(long submitter_id) {
		this.submitter_id = submitter_id;
	}
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	public long getTicket_form_id() {
		return ticket_form_id;
	}
	public void setTicket_form_id(long ticket_form_id) {
		this.ticket_form_id = ticket_form_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Object getVia() {
		return via;
	}
	public void setVia(Object via) {
		this.via = via;
	}
	public long getVia_followup_source_id() {
		return via_followup_source_id;
	}
	public void setVia_followup_source_id(long via_followup_source_id) {
		this.via_followup_source_id = via_followup_source_id;
	}
	public String [] getFields() {
		return fields;
	}
	public void setFields(String [] fields) {
		this.fields = fields;
	}
	
}
