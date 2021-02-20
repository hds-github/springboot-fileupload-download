package com.javatech.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.javatech.file.property.FileAttributes;

@SpringBootApplication
@EnableConfigurationProperties({
		FileAttributes.class
})
public class FileUploadDownloadApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileUploadDownloadApplication.class, args);
	}
}
