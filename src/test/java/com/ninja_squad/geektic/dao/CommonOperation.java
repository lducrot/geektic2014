package com.ninja_squad.geektic.dao;

import com.ninja_squad.dbsetup.operation.Operation;

import static com.ninja_squad.dbsetup.Operations.deleteAllFrom;
import static com.ninja_squad.dbsetup.Operations.insertInto;
import static com.ninja_squad.dbsetup.Operations.sequenceOf;

public class CommonOperation {

	public static final Operation DELETE_ALL = deleteAllFrom("LIEN_GEEK_CI", "GEEK", "CENTREINTERET");
	
	public static final Operation INSERT_REFERENCE_DATA = sequenceOf(
			insertInto("GEEK")
				.columns("idGeek", "nom", "prenom", "email", "ville", "sexe")
					.values(1L, "DUCROT", "Lauriane", "lauriane.ducrot@gmail.com", "LISSIEU", "F")
					.values(2L, "ESCURE", "Philippe", "philippe.escure@gmail.com", "LYON", "M")
					.values(3L, "MONET", "Marine", "monet.marine@gmail.com", "ST MOLF", "F")
					.build(),
			insertInto("CENTREINTERET")
				.columns("idCentreInteret", "libelle")
					.values(1L, "CINEMA")
					.values(2L, "SPORT")
					.values(3L, "PROGRAMMATION")
					.values(4L, "CULTURE MARINE")
					.values(5L, "ANIMAUX")
					.values(6L, "NOUVELLES TECHNOLOGIE")
					.values(7L, "MUSIQUE")
					.values(8L, "ART")
					.build(),
			insertInto("LIEN_GEEK_CI")
				.columns("idGeek", "idCentreInteret")
					.values(1L, 1L)
					.values(1L, 7L)
					.values(1L, 6L)
					.values(2L, 3L)
					.values(2L, 5L)
					.values(3L, 4L)
					.values(3L, 5L)
					.values(3L, 8L)
					.build()
			);
			
	
}
