
  package com.example.sba;
  
  import static org.assertj.core.api.Assertions.assertThat;
  
  import java.util.Optional;
  
  import org.junit.Test; import org.junit.runner.RunWith; import
  org.mockito.Mockito; import
  org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest; import
  org.springframework.boot.test.mock.mockito.MockBean; import
  org.springframework.http.MediaType; import
  org.springframework.test.context.junit4.SpringRunner; import
  org.springframework.test.web.servlet.MockMvc; import
  org.springframework.test.web.servlet.MvcResult; import
  org.springframework.test.web.servlet.RequestBuilder; import
  org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
  
  import com.example.sba.controller.AdminRestController; import
  com.example.sba.model.Mentor;
import com.example.sba.service.AdminService;
import
  com.example.sba.service.AdminServiceImpl; import
  com.fasterxml.jackson.core.JsonProcessingException; import
  com.fasterxml.jackson.databind.ObjectMapper;
  
  
  @RunWith(SpringRunner.class)
  
  @WebMvcTest(value=AdminRestController.class,secure=false) public class
  MentorOnDemandApplicationTests {
  
  @Autowired private MockMvc mockMvc;
  
  @MockBean private AdminService adminService;
  
  
  @Test public void testMentor() throws Exception{
	  Mentor mockMentor=new Mentor();
   mockMentor.setId(1);
  mockMentor.setUserName("deosharmakeshav@gmail.com");
  mockMentor.setPassword("1234"); long number=9681178550L;
  mockMentor.setContact(number); mockMentor.setRegCode("MENTOR65691");
  mockMentor.setRegDatetime("10/09/2019 11:39:02");
  mockMentor.setLinkedinUrl("keshavdeo");
  Mockito.when(adminService.getMentor(Mockito.anyInt())).thenReturn(mockMentor); 
 String URI="/mentorprofile/check/1"; RequestBuilder requestBuilder
  =MockMvcRequestBuilders.get(URI).accept(MediaType.APPLICATION_JSON);
  MvcResult result=mockMvc.perform(requestBuilder).andReturn(); String
  expectedJson=this.mapToJson(mockMentor); String
  outputInJson=result.getResponse().getContentAsString();
  System.out.println("expeectedJson======="+expectedJson);
  System.out.println("outputInJson=============="+outputInJson);
  assertThat(outputInJson).isEqualTo(expectedJson); 
  }
  
  private String mapToJson(Object object) throws JsonProcessingException{
  ObjectMapper objectMapper=new ObjectMapper(); return
  objectMapper.writeValueAsString(object); } 
  }
  
  
  
 