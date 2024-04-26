package some.casestudy.controller;

import some.casestudy.domain.Standard;
import some.casestudy.service.StandardService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StandardController {

	private final StandardService standardService;

	@Value("${case-study.title}")
	private String pageTitle;

	public StandardController(
		final StandardService standardService
	) {
		this.standardService = standardService;
	}

	@GetMapping(value = { "/", "/index" })
	public String index(final Model model) {
		this.addBasicAttributes(model);

		final List<Standard> standardList = this.standardService.findAllOrderByIssueDateDesc();
		model.addAttribute("standardList", standardList);

		return "index";
	}

	private void addBasicAttributes(final Model model) {
		model.addAttribute("pageTitle", this.pageTitle);
	}
}
