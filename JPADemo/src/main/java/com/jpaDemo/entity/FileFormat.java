/**
 * 
 */
package com.jpaDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author vmadhe01
 *
 */
@Entity
@Table(name="file_formats")
public class FileFormat {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ff_id")
	private Integer fFId;
	
	@Column(name="format_name")
	private String formatName;
	
	@Column(name="folder_name")
	private String folderName;

	public Integer getfFId() {
		return fFId;
	}

	public void setfFId(Integer fFId) {
		this.fFId = fFId;
	}

	public String getFormatName() {
		return formatName;
	}

	public void setFormatName(String formatName) {
		this.formatName = formatName;
	}

	public String getFolderName() {
		return folderName;
	}

	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}

	@Override
	public String toString() {
		return "FileFormats [fFId=" + fFId + ", formatName=" + formatName + ", folderName=" + folderName + "]\n";
	}

	/**
	 * @return the fFId
	 */
	
	
}
