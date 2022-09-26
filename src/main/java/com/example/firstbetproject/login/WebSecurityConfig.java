package com.example.firstbetproject.login;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {
 
   
 
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
     
        http.authorizeRequests()
        		//이미지 경로는 로그인 시큐리티에서 허용
        		.antMatchers("/images/**").permitAll()
        		//css 경로는 스프링 시큐리티에서 허용
        		.antMatchers("/css/**").permitAll()       
        		//어떤 요청이든 인증해야함
                .anyRequest().authenticated()
                .and()
                .formLogin()
                //  로그인 페이지  	.loginPage("/login")
                //  .usernameParameter("email")
                .defaultSuccessUrl("/main")
                .permitAll()
                .and()
       //         .rememberMe().key("AbcdEfghIjklmNopQrsTuvXyz_0123456789")
                //로그아웃
                .logout()
                .permitAll();
                
                
    
 
        http.headers().frameOptions().sameOrigin();
 
        return http.build();
    }
 
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().antMatchers("/images/**", "/js/**", "/webjars/**");
    }
 
}




