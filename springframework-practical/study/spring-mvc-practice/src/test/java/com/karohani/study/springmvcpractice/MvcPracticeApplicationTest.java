package com.karohani.study.springmvcpractice;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class MvcPracticeApplicationTest {
/*
    수동 설정
 */
//    @Autowired
//    private WebApplicationContext webApplicationContext;
//
//    @Autowired
//    private SessionRepository sessionRepository;
//
//    @Autowired
//    private SessionRepositoryFilter sessionFilter;
    //    @BeforeEach
//    public void init () {
//        this.mockMvc = MockMvcBuilders.webAppContextSetup( webApplicationContext )
//            .addFilter( sessionFilter )
//            .build();
//        session.setAttribute( "CI", "CI_ENC" );
//    }
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void sessionTest() throws Exception {
        MockHttpSession mockHttpSession = new MockHttpSession();
        mockHttpSession.setAttribute( "KEY", "VALUE" );
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get(
            "/api/practice/session" )
            .session( mockHttpSession )
            ;

        mockMvc.perform( request )
            .andExpect( status().isOk() )
            .andExpect( MockMvcResultMatchers.content().string( "VALUE" ) )
            .andDo( MockMvcResultHandlers.print() );
    }

    @Test
    public void objectSession() throws Exception {
        MockHttpSession mockHttpSession = new MockHttpSession();
        mockHttpSession.setAttribute( "OBJECT_KEY", new com.karohani.study.springmvcpractice.controller.SessionController.TestDto("KK", "RR") );
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get(
                "/api/practice/session/object" )
            .session( mockHttpSession )
            ;

        mockMvc.perform( request )
            .andExpect( status().isOk() )
            .andExpect( MockMvcResultMatchers.content().string( "{\"aa\":\"KK\",\"bb\":\"RR\"}" ) )
            .andDo( MockMvcResultHandlers.print() );
    }
}