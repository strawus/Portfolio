package ru.zolotarev.portfolio.controller;

import org.springframework.stereotype.Controller;

@Controller
public class ViewController {

	/*private final UserService userService;
	private final ProjectService projectService;
	private final FileService fileService;

	@Autowired
	@SuppressWarnings("SpringJavaAutowiringInspection")
	public ViewController(final UserService userService, final ProjectService projectService, final FileService fileService) {
		this.userService = userService;
		this.projectService = projectService;
		this.fileService = fileService;
	}

	@GetMapping(value = {"", "/", "/index", "/home"})
	public ModelAndView mainPageView(final ModelAndView modelAndView) {
		final User user = this.userService.getMainUserByEager();
		modelAndView.addObject("user", user);
		modelAndView.addObject("experiences", user.getExperiences());
		modelAndView.addObject("educations", user.getEducations());
		modelAndView.addObject("courses", user.getCourses());
		modelAndView.addObject("skills", user.getSkills());
		modelAndView.addObject("languages", user.getLanguages());
		modelAndView.addObject("projects", this.projectService.getAndSortByIndex());
		modelAndView.addObject("slide", this.fileService.getRandomByFileType(FileType.SLIDE));
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@GetMapping(value = "/project/{url}")
	public ModelAndView getProjectByUrlPage(@PathVariable(value = "url") final String url, final ModelAndView modelAndView) {
		modelAndView.addObject("user", this.userService.getMainUser());
		modelAndView.addObject("project", this.projectService.getByUrl(url));
		modelAndView.addObject("admin", this.userService.getAuthenticatedUser() != null);
		modelAndView.setViewName("client/project/one");
		return modelAndView;
	}

	@GetMapping("/admin")
	public ModelAndView adminPageView(final ModelAndView modelAndView){

	}

	public ModelAndView loginPageView(final ModelAndView modelAndView) {

	}*/
}
