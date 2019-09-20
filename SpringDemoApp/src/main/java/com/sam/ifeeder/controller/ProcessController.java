package com.sam.ifeeder.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sam.ifeeder.exception.RecordNotFoundException;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api")
@Api(value="IFeeder Process System", description="Data Process System")
public class ProcessController {

	 @GetMapping("/processShipment")
	 @ApiOperation(value = "Process shipment data and stores in Cassandra DB", response = String.class)
	 @ApiResponses(value = {
			    @ApiResponse(code = 200, message = "Successfully completed processing"),
			    @ApiResponse(code = 401, message = "Not authorized person"),
			    @ApiResponse(code = 403, message = "Service is forbidden"),
			    @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
			})
	 public String processShipment() {
	  return "From process shipment method...";
	 }
	 @GetMapping("/processGoodReceived")
	 @ApiOperation(value = "Process Goods data and stores in S3 DB", response = String.class)
	 public ResponseEntity<String> processGoodReceived()
	   throws RecordNotFoundException {
	  return ResponseEntity.ok().body("From processGoodReceived method...");
	 }
	 @PostMapping("/processWarehouseData")
	 @ApiOperation(value = "Process warehouse data and stores in cassandra DB", response = String.class)
	 public String processWarehouseData() {
	  return "From processWarehouseData method...";
	 }
	 @GetMapping("/processUserReviews")
	 @ApiOperation(value = "Process user reviews and stores in S3 DB", response = String.class)
	 public String processUserReviews(@PathVariable(value = "id") Long employeeId)
	   throws RecordNotFoundException {
	  return "From processUserReviews method...";
	 }
	 
	 
	 
	 
	 // @ApiParam(value = "Employee object store in database table", required = true) 
	 // http://localhost:8080/swagger-ui.html
}
