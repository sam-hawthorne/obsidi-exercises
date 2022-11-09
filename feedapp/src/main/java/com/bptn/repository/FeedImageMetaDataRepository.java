package com.bptn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bptn.models.ImageMetaData;

public interface FeedImageMetaDataRepository extends JpaRepository<ImageMetaData, String> {
	
	ImageMetaData findByImageid(String imageID);
	
	List<ImageMetaData> findByPostkey(String postkey);

}
