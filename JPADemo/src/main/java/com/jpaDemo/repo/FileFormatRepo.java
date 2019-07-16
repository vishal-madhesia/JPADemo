/**
 * 
 */
package com.jpaDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpaDemo.entity.FileFormat;

/**
 * @author vmadhe01
 *
 */
public interface FileFormatRepo extends JpaRepository<FileFormat, Integer> {
	
	
	
}
