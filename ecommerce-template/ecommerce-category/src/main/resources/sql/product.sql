DROP TABLE IF EXISTS sdata_product;
CREATE TABLE sdata_product (
  id                VARCHAR(30)  COMMENT '主键，UUID_SHORT()生成' PRIMARY KEY,
  name              VARCHAR(80)  COMMENT '商品名'NOT NULL,
	keyword 					VARCHAR(200) COMMENT '关键字',
	category_id       VARCHAR(30)  COMMENT '分类ID',
	manufacturer      VARCHAR(80)  COMMENT '生产商',
	msrp              DECIMAL(8,2) COMMENT '建议零售价',
	saleprice         DECIMAL(8,2) COMMENT '实际零售价',
	active_begin_date VARCHAR(20)  COMMENT '生效开始时间',
  active_end_date   VARCHAR(20)  COMMENT '生效结束时间',
	template        	VARCHAR(60)  COMMENT '商品展示模板',
	create_by         VARCHAR(30)  COMMENT '创建人',
	create_date       VARCHAR(20)  COMMENT '创建时间',
	update_by         VARCHAR(30)  COMMENT '更新人',
	update_date       VARCHAR(20)  COMMENT '更新时间',
  active            BOOLEAN   DEFAULT TRUE COMMENT '是否启用'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='spu表';

DROP TABLE IF EXISTS sdata_product_spec;
CREATE TABLE `sdata_product_spec` (
  `id` VARCHAR(30) PRIMARY KEY,
  `spec_name` varchar(50) NOT NULL COMMENT '规格名称'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='规格表';

DROP TABLE IF EXISTS sdata_product_spec_value;
CREATE TABLE `sdata_product_spec_value` (
  `id` VARCHAR(30) PRIMARY KEY,
  `spec_id` VARCHAR(30) NOT NULL COMMENT '规格id',
  `spec_value` varchar(50) NOT NULL COMMENT '规格值'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='规格值表';

DROP TABLE IF EXISTS sdatd_product_spu_spec;
CREATE TABLE `sdatd_product_spu_spec` (
  `id`      VARCHAR(30)  COMMENT '主键，UUID_SHORT()生成' PRIMARY KEY,
  `spu_id`  VARCHAR(30) NOT NULL COMMENT 'spu_id',
  `spec_id` VARCHAR(30) NOT NULL COMMENT 'spec_id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='spu规格表';


DROP TABLE IF EXISTS sdata_product_cross_sale;
CREATE TABLE sdata_product_cross_sale (
  id                    VARCHAR(30) COMMENT '主键，UUID_SHORT()生成' PRIMARY KEY,
  base_product_id       VARCHAR(30) COMMENT '主product id'     NOT NULL,
  cross_sale_product_id VARCHAR(30) COMMENT '交叉销售的proudct id' NOT NULL,
  display_order         INTEGER COMMENT '展示顺序',
  UNIQUE (base_product_id, cross_sale_product_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='交叉销售表';

DROP TABLE IF EXISTS sdata_product_up_sale;
CREATE TABLE sdata_product_up_sale (
  id                 VARCHAR(30) COMMENT '主键，UUID_SHORT()生成' PRIMARY KEY,
  base_product_id    VARCHAR(30) COMMENT '主product id'     NOT NULL,
  up_sale_product_id VARCHAR(30) COMMENT '向上销售的proudct id' NOT NULL,
  display_order      INTEGER COMMENT '展示顺序',
  UNIQUE (base_product_id, up_sale_product_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='向上销售表';

DROP TABLE IF EXISTS sdata_product_option;
CREATE TABLE sdata_product_option (
  id              VARCHAR(30) COMMENT '主键，UUID_SHORT()生成' PRIMARY KEY,
  base_product_id VARCHAR(30) COMMENT '主product id' NOT NULL,
  name            VARCHAR(30) COMMENT '选项名字',
  UNIQUE (base_product_id, name)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='操作选项表';

DROP TABLE IF EXISTS sdata_sku;
CREATE TABLE sdata_sku (
  id       VARCHAR(30) COMMENT '主键，UUID_SHORT()生成' PRIMARY KEY,
  name     VARCHAR(80) COMMENT 'SKU名字' NOT NULL,
	spu_id   VARCHAR(30)  NOT NULL COMMENT 'spu_id',
  keywords VARCHAR(200) COMMENT '商品关键字',
  active_begin_date VARCHAR(30) COMMENT '生效开始时间',
  active_end_date   VARCHAR(30) COMMENT '生效结束时间',
  price decimal(9,2) NOT NULL COMMENT '售价',
  stock int(11) NOT NULL COMMENT '库存',
  active            BOOLEAN COMMENT '是否启用'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='sku表';

DROP TABLE IF EXISTS sdata_sku_option_value;
CREATE TABLE sdata_sku_option_value (
  id                VARCHAR(30) COMMENT '主键，UUID_SHORT()生成' PRIMARY KEY,
  sku_id            VARCHAR(30) COMMENT 'sku id' NOT NULL,
  option_id         VARCHAR(30) COMMENT '选项ID'   NOT NULL,
  option_value      VARCHAR(60) COMMENT '选项值'    NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='操作选项值表';

DROP TABLE IF EXISTS sdata_sku_spec_value;
CREATE TABLE `sdata_sku_spec_value` (
  `id` VARCHAR(30)  COMMENT '主键，UUID_SHORT()生成' PRIMARY KEY,
  `sku_id` VARCHAR(30) NOT NULL COMMENT 'sku_id',
  `spec_value_id`  VARCHAR(30) NOT NULL COMMENT '规格值id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='sku规格值';

# Constraint Definitions
ALTER TABLE sdata_product
  ADD CONSTRAINT `fk_sdata_product_category_id` FOREIGN KEY (category_id) REFERENCES sdata_category (id);
ALTER TABLE sdata_product_cross_sale
  ADD CONSTRAINT `fk_sdata_cross_product_base_product_id` FOREIGN KEY (base_product_id) REFERENCES sdata_product (id);
ALTER TABLE sdata_product_cross_sale
  ADD CONSTRAINT `fk_sdata_cross_product_cross_sale_product_id` FOREIGN KEY (cross_sale_product_id) REFERENCES sdata_product (id);
ALTER TABLE sdata_product_up_sale
  ADD CONSTRAINT `fk_sdata_product_up_sale_base_product_id` FOREIGN KEY (base_product_id) REFERENCES sdata_product (id);
ALTER TABLE sdata_product_up_sale
  ADD CONSTRAINT `fk_sdata_product_up_sale_product_id` FOREIGN KEY (up_sale_product_id) REFERENCES sdata_product (id);
ALTER TABLE sdata_product_option
  ADD CONSTRAINT `fk_sdata_product_option_base_product_id` FOREIGN KEY (base_product_id) REFERENCES sdata_product (id);
ALTER TABLE sdata_sku_option_value
  ADD CONSTRAINT `fk_sdata_sku_option_value_sku_id` FOREIGN KEY (sku_id) REFERENCES sdata_sku (id);
ALTER TABLE sdata_sku_option_value
  ADD CONSTRAINT `fk_sdata_sku_option_value_option_id` FOREIGN KEY (option_id) REFERENCES sdata_product_option (id);
ALTER TABLE sdata_sku
	ADD CONSTRAINT fk_sdata_sku_product_id FOREIGN KEY (spu_id) REFERENCES sdata_product(id);
ALTER TABLE sdatd_product_spu_spec
	ADD CONSTRAINT fk_sdatd_product_spu_spec_product_id FOREIGN KEY (spu_id) REFERENCES sdata_product(id);
ALTER TABLE sdatd_product_spu_spec
	ADD CONSTRAINT fk_sdatd_product_spu_spec_spec_id FOREIGN KEY (spec_id) REFERENCES sdata_product_spec(id);
ALTER TABLE sdata_product_spec_value
	ADD CONSTRAINT fk_sdatd_product_spu_spec_value_spec_id FOREIGN KEY (spec_id) REFERENCES sdata_product_spec(id);
ALTER TABLE sdata_sku_spec_value
	ADD CONSTRAINT fk_sdata_sku_spec_value_sku_id FOREIGN KEY (sku_id) REFERENCES sdata_sku(id);
ALTER TABLE sdata_sku_spec_value
	ADD CONSTRAINT fk_sdata_sku_spec_value_spec_value_id FOREIGN KEY (spec_value_id) REFERENCES sdata_product_spec_value(id);
