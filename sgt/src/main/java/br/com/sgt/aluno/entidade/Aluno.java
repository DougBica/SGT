//package br.com.sgt.aluno.entidade;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.MapsId;
//import javax.persistence.OneToOne;
//
//import br.com.sgt.entidades.User;
//
////@Entity
//public class Aluno {
//	
////	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//	public Long id;
//	
////	@OneToOne @MapsId
//	public User user;
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Aluno other = (Aluno) obj;
//		if (id == null) {
//			if (other.id != null)
//				return false;
//		} else if (!id.equals(other.id))
//			return false;
//		return true;
//	}
//
//}
