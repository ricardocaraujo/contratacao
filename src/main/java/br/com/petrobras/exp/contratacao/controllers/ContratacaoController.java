package br.com.petrobras.exp.contratacao.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.core.convert.support.*;

import br.com.petrobras.exp.contratacao.controllers.utils.StringToEnumConverterFactory;
import br.com.petrobras.exp.contratacao.domain.Contratacao;
import br.com.petrobras.exp.contratacao.domain.enums.TipoContratacao;
import br.com.petrobras.exp.contratacao.repositories.ContratacaoRepository;
import br.com.petrobras.exp.contratacao.repositories.GenericRepository;

@Controller
public class ContratacaoController {
	
	@Autowired
	@Qualifier("contratacaoRepository")
	private GenericRepository contratacaoRepo;

	@RequestMapping(value = "/contratacao/form")
	public String form(Model model) {
		model.addAttribute("contratos", new Contratacao());
		model.addAttribute("tipos", Arrays.asList(TipoContratacao.values()));
		return "adicionaContratacao";
	}

	@RequestMapping(value="/contratacao", method=RequestMethod.POST)
	public String insert(@ModelAttribute("contratos") Contratacao contratacao, 
							@ModelAttribute("tipos") ArrayList<TipoContratacao> tipos, Model model) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//contratacao.setId(null);
		contratacaoRepo.insert(contratacao);
		return "redirect:listar";
	}
	
	@RequestMapping(value="/listar", method=RequestMethod.GET)
	public String list(Model model) {
		List<Contratacao> contratacoes = contratacaoRepo.findAll();
		model.addAttribute("contratacoes", contratacoes);
		return "listaContratacoes";
	}
}
