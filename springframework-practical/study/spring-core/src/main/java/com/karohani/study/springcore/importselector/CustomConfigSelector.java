package com.karohani.study.springcore.importselector;

import com.karohani.study.springcore.LanguageType;
import com.karohani.study.springcore.annotationimport.EnableCustom;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

public class CustomConfigSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(EnableCustom.class.getName(), false);
        AnnotationAttributes annotationAttributes1 = AnnotationAttributes.fromMap(annotationAttributes);
        LanguageType type = annotationAttributes1.<LanguageType>getEnum("type");
        return new String[0];
    }
}
