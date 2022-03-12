open module web {
    requires spring.beans;
    requires spring.web;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.boot;
    requires com.fasterxml.jackson.annotation;
    requires org.apache.tomcat.embed.core;
    requires domain;
    requires service;
}