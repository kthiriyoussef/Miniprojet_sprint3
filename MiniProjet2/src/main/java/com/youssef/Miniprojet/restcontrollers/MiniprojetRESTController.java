package com.youssef.Miniprojet.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.youssef.Miniprojet.entities.Voiture;
import com.youssef.Miniprojet.service.VoitureService;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class MiniprojetRESTController {
	@Autowired
	VoitureService voitureService;
	@RequestMapping(method = RequestMethod.GET)
	public List<Voiture> getAllVoitures() {
		return voitureService.getAllvoiture();
		}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Voiture getVoitureById(@PathVariable("id") Long id) {
	return voitureService.getVoiture(id);
	 }
	@RequestMapping(method = RequestMethod.POST)
	public Voiture createVoiture(@RequestBody Voiture voiture) {
	return voitureService.saveVoiture(voiture);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Voiture updateVoiture(@RequestBody Voiture voiture) {
	return voitureService.UpdateVoiture(voiture);
	}
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteVoiture(@PathVariable("id") Long id)
	{
	voitureService.deleteVoitureById(id);
	}
	@RequestMapping(value="/voitMarq/{idMarq}",method = RequestMethod.GET)
	public List<Voiture> getProduitsByCatId(@PathVariable("idMarq") Long idMarq) {
	return voitureService.findByMarqueIdMarque(idMarq);
	}

}

