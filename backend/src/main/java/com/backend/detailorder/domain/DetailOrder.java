package com.backend.detailorder.domain;

import java.math.BigDecimal;

import com.backend.orderservice.domain.OrderService;
import com.backend.service.domain.Service;
import com.backend.utils.enums.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "detail_orders")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
public class DetailOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	@Column(name = "detail_order_id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "order_service_id")
	private OrderService orderService;

	@ManyToOne
	@JoinColumn(name = "service_id")
	private Service service;

	@Column(name = "service_value", precision = 10, scale = 2)
	private BigDecimal serviceValue;

	@Enumerated(EnumType.STRING)
	Status status;
}
