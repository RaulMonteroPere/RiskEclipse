package com.ite.riskadventureSPRING.controller;


	
	import java.util.Date;
import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.ite.riskadventureSPRING.modelo.beans.Empresa;
import com.ite.riskadventureSPRING.modelo.beans.Evento;
import com.ite.riskadventureSPRING.modelo.beans.Experiencia;
import com.ite.riskadventureSPRING.modelo.beans.Tipo;
import com.ite.riskadventureSPRING.modelo.dao.IntEmpresaDao;
import com.ite.riskadventureSPRING.modelo.dao.IntEventoDao;
import com.ite.riskadventureSPRING.modelo.dao.IntTipoDao;
import com.ite.riskadventureSPRING.modelo.dao.TipoDaoImpl;

	

	@Controller
	@RequestMapping("/riskadventure")
	public class riskadventureController {
		@Autowired
		IntEmpresaDao edao;
		@Autowired
		IntEventoDao evdao;
		@Autowired
		IntTipoDao tdao;
		
		//Controlador de index--------------------------------------
		@GetMapping("/index")
		public String inicio(Model model) {
			model.addAttribute("mensaje","Lidia Capita ");
			
			return "index";
			
		}
		
		//controladores de landings---------------------------------
		@GetMapping("/experiencias")
		public String inicio1(Model model) {
			model.addAttribute("mensaje","Lidia Capita ");
			
			return "experiencias";
			
		}
		
		@GetMapping("/tipoAgua")
		public String empresaPorExperienciaAgua(Model model,@RequestParam(name = "idExperiencia") int idExperiencia ) {
			model.addAttribute("mensaje","Lidia Capita ");
			List<Empresa> listaTipo = edao.verPorExperiencia(idExperiencia);
			model.addAttribute("listaTipoAgua", listaTipo);
			
			return "agua";
			
		}
		@GetMapping("/agua")
		public String inicio2(Model model) {
			model.addAttribute("mensaje","Lidia Capita ");
			
			return "agua";
			
		}
		
		@GetMapping("/tipoAire")
		public String empresaPorExperienciaAire(Model model,@RequestParam(name = "idExperiencia") int idExperiencia ) {
			model.addAttribute("mensaje","Lidia Capita ");
			List<Empresa> listaTipo = edao.verPorExperiencia(idExperiencia);
			model.addAttribute("listaTipoAire", listaTipo);
			
			return "aire";
		}
		
		@GetMapping("/aire")
		public String inicio3(Model model) {
			model.addAttribute("mensaje","Lidia Capita ");
			
			return "aire";
			
		}
		@GetMapping("/ofertas")
		public String inicio22(Model model) {
			model.addAttribute("mensaje","Lidia Capita ");
			
			return "ofertas";
			
		}
		
		
		
		@GetMapping("/tipoTierra")
		public String empresaPorExperienciaTierra(Model model,@RequestParam(name = "idExperiencia") int idExperiencia ) {
			model.addAttribute("mensaje","Lidia Capita ");
			List<Empresa> listaTipo = edao.verPorExperiencia(idExperiencia);
			model.addAttribute("listaTipoTierra", listaTipo);
			
			return "tierra";
			
		}
		@GetMapping("/tierra")
		public String inicio4(Model model) {
			model.addAttribute("mensaje","Lidia Capita ");
			
			return "tierra";
			
		}
		
		@GetMapping("/articulos")
		public String inicio5(Model model) {
			model.addAttribute("mensaje","Lidia Capita ");
			
			return "articulos";
			
		}
		@GetMapping("/detalleOferta")
		public String detalleOferta(Model model,@RequestParam(name = "idEvento") int idEvento ) {
			model.addAttribute("mensaje","Lidia Capita ");
			Evento evento = evdao.mostrarEvento(idEvento);
			model.addAttribute("verDetalleEvento", evento);
			
			return "detalleoferta";
			
		}
		
		@GetMapping("/tipoOferta")
		public String oferta(Model model) {
			model.addAttribute("mensaje","Lidia Capita ");
			List<Evento> listaEvento = evdao.verTodos();
			model.addAttribute("listaOferta", listaEvento);
			
			return "ofertas";
			
		}
		@GetMapping("/tipoOfertaDestacado")
		public String ofertaDestacado(Model model,@RequestParam(name = "destacado") String destacado ) {
			model.addAttribute("mensaje","Lidia Capita ");
			List<Evento> listaEventoDestacado = evdao.verPorDestacado(destacado);
			model.addAttribute("listaOfertaDestacado", listaEventoDestacado);
			
			return "ofertas";
			
		}
		
		
		
		@GetMapping("/aviso_legal")
		public String inicio6(Model model) {
			model.addAttribute("mensaje","Lidia Capita ");
			
			return "aviso_legal";
			
		}
		@GetMapping("/blog")
		public String inicio7(Model model) {
			model.addAttribute("mensaje","Lidia Capita ");
			
			return "blog";
			
		}
		@GetMapping("/carrito")
		public String inicio8(Model model) {
			model.addAttribute("mensaje","Lidia Capita ");
			
			return "carrito";
			
		}
		@GetMapping("/contacto")
		public String inicio9(Model model) {
			model.addAttribute("mensaje","Lidia Capita ");
			
			return "contacto";
			
		}
		@GetMapping("/cookies")
		public String inicio10(Model model) {
			model.addAttribute("mensaje","Lidia Capita ");
			
			return "cookies";
			
		}
		@GetMapping("/eventos")
		public String inicio11(Model model) {
			model.addAttribute("mensaje","Lidia Capita ");
			
			return "eventos";
			
		}
		@GetMapping("/login")
		public String inicio12(Model model) {
			model.addAttribute("mensaje","Lidia Capita ");
			
			return "login";
			
		}
		@GetMapping("/nosotros")
		public String inicio13(Model model) {
			model.addAttribute("mensaje","Lidia Capita ");
			
			return "nosotros";
			
		}
		@GetMapping("/packs")
		public String inicio14(Model model) {
			model.addAttribute("mensaje","Lidia Capita ");
			
			return "packs";
			
		}
		@GetMapping("/politica_privacidad")
		public String inicio15(Model model) {
			model.addAttribute("mensaje","Lidia Capita ");
			
			return "politica_privacidad";
			
		}
		@GetMapping("/registro")
		public String inicio16(Model model) {
			model.addAttribute("mensaje","Lidia Capita ");
			
			return "registro";
			
		}
		@GetMapping("/vermasblog")
		public String inicio17(Model model) {
			model.addAttribute("mensaje","Lidia Capita ");
			
			return "vermasblog";
			
		}
		

		@GetMapping("/detalleoferta")
		public String inicio18(Model model) {
			model.addAttribute("mensaje","Lidia Capita ");
			
			return "detalleoferta";
			
		}
		
		@GetMapping("/panel")
		public String mostrarActivos(Model model) {
			
			//Muestro los eventos activos
			List<Evento> listado = evdao.buscarEventosActivos("activo");
			model.addAttribute("listadoActivos", listado);
			
			//Cargo en el select de la derecha los Tipos actuales existentes
			List<Tipo> listadoTipos = tdao.verTodos();
			model.addAttribute("listadoTipos", listadoTipos);
			
			return "admin";
			
		}
		
		
		//Método para crear un nuevo evento. Me tengo que traer los tipos para meterlos en el
		//select al final del formulario
		@GetMapping("/create")
		public String nuevoEvento(Model model) {
			
			List<Tipo> listadoTipos = tdao.verTodos();
			model.addAttribute("listadoTipos", listadoTipos);
			
			return "nuevoevento";
		}
		
		
		//Por Post, recojo las respuestas del formulario una vez relleno
		@PostMapping("/create")
		public RedirectView altaEvento(Model model, Evento evento, @RequestParam("efechaInicio") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaInicio) {
			String mensaje;
			
			evento.setEstado("activo");
			evento.setDestacado("s");
			evento.setFechaInicio(fechaInicio);
			
			int altaOk = evdao.crearEvento(evento);
			
			if(altaOk == 1) {
				mensaje = "<span style=\"color: green;\">Evento creado con éxito</span>";
			} else {
				mensaje = "<span style=\"color: red;\">Ha habido un error al crear el evento<span>";
			}
			
			model.addAttribute("mensaje", mensaje);
			
			return new RedirectView("/riskadventure/activos");
		}
		
		
		//Elimina el evento con el "id" que le pasemos
		@GetMapping("/eliminar/{id}")
		public String eliminarEvento(Model model, @PathVariable(name="id") int  idEvento) {
				
			String mensaje;
				
			int eliminado = evdao.eliminarEvento(idEvento);
				
			if(eliminado == 1) {
				mensaje = "<span style=\"color: green;\">Se ha eliminado el evento</span>";
			} else {
				mensaje = "<span style=\"color: red;\">Ha habido un error al intentar eliminar el evento<span>";
			}
				
			model.addAttribute("mensaje", mensaje);
				
			List<Evento> listado = evdao.buscarEventosActivos("activo");
			model.addAttribute("listadoActivos", listado);
				
			return "admin";
		}
		
		
		
		//Edita el evento seleccionado con el id que le pasemos
		@GetMapping("/editar/{id}")
		public String editarEvento(Model model, @PathVariable(name="id") int  idEvento) {
			String mensaje;
			
			Evento evento = evdao.mostrarEvento(idEvento);
			
			if(evento == null) {
				mensaje = "<span style=\"color: red;\">Ha habido un error al recuperar el evento<span>";
			}
			
			model.addAttribute("evento", evento);
			return "evento";
		}
		
		
	}


