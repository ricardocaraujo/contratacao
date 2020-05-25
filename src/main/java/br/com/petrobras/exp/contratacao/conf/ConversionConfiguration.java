package br.com.petrobras.exp.contratacao.conf;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;

import br.com.petrobras.exp.contratacao.controllers.utils.StringToEnumConverterFactory;
import br.com.petrobras.exp.contratacao.domain.enums.TipoContratacao;

@Configuration
public class ConversionConfiguration {

    @Bean(name="conversionService")
    public ConversionService getConversionService() {
        ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
        bean.setConverters(getConverters());
        bean.afterPropertiesSet();
        ConversionService object = bean.getObject();
        return object;
    }

    private Set<Converter> getConverters() {
    	Set<Converter> converters = new HashSet<Converter>();
    	converters.add(new StringToEnumConverterFactory().getConverter(TipoContratacao.class));
    	return converters;
    }
}