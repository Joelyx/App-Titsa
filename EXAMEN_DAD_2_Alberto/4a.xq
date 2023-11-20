for $proveedor in /datos/proveedores/proveedor[estado > 15]
return $proveedor/ciudad/text()



count(/datos/proyectos/proyecto[ciudad = 'Londres'])



for $proyecto in /datos/proyectos/proyecto[ciudad = 'Paris']
where sum(/datos/suministros[suministra/numproyecto = $proyecto/@numproyecto]/suministra/cantidad) > 350
return $proyecto/nombreproyecto/text()

