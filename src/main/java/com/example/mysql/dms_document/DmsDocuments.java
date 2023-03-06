package com.example.mysql.dms_document;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@Entity
@ToString
@NoArgsConstructor
@Table(name= "DMS_DOCUMENTS")
public class DmsDocuments {

    @Id
    private Long ID;
    private String PERIOD_ID;
    private String DOCUMENT_TYPE;
    private String ORGANIZATION_ID;
    private String DOC_REG_NO;
    private String DOC_REG_DATE;
    private String DOCUMENT_NO;
    private String DOCUMENT_DATE;
    private String RECEIVED_FORM;
    private String PAGE_COUNT;
    private String COPY_COUNT;
    private String PARENT_DOCUMENT_ID;
    private String RELATED_DOCUMENT;
    private String DATE_TAKEN_TO_CONTROL;
    private String ORIGINAL_COPY_PLACE;
    private String ARCHIVE_EXISTENCE_SIGNED_BY;
    private String PLANNED_EXECUTION_DATE;
    private String CURRENT_EXECUTION_DATE;
    private String EXECUTED_DATE;
    private String DEPARTMENT_ID;
    private String BARCODE;
    private String IS_DUPLICATE;
    private String DUPLICATE_DOCUMENT_ID;
    private String DESCRIPTION;
    private String DESCRIPTION_HTML;
    private String DATE_EXTENDED;
    private String DATE_SENDED;
    private String UNDERCONTROL_STATUS;
    private String APPLICATION_TYPE_ID;
    private String TOPIC_ID;
    private String DOCUMENT_STATUS_ID;
    private String PLANNED_EXEC_DATE2;
    private String PLANNED_EXEC_DATE3;
    private String RELATED_TO_SENDED;
    private String DATE_REPORTED;
    private String EXECUTOR_ORGANIZATION;
    private String MAIN_EXECUTOR;
    private String MAIN_EXEC_ORG;
    private String ATTACHMENTS_COUNT;
    private String EXECUTION_EXTEND_REASON;
    private String EXECUTION_NOTES;
    private String MAIN_EXECUTOR_PHONE;
    private String TOTAL_NOTES;
    private String STATUS;
    private String INSERT_USER_ID;
    private String INSERT_DATETIME;
    private String UPDATE_USER_ID;
    private String UPDATE_DATETIME;
    private String IS_DELETED;
    private String LAST_DISPATCH_USER;
    private String ORDER_NUMBER;
    private String MAIN_EXECUTOR_POSITION;
    private String FIRST_MAIN_EXECUTOR;
    private String MAIN_EXECUTOR_SECTION;
    private String DOCUMENT_ORGANIZATION;
    private String DELETE_DATETIME;
    private String MIGRATION;











}
