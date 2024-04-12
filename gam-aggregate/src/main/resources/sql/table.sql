create table approximation_sub_stat_meta
(
    stat_type             varchar(50)     not null comment '옵션 종류',
    approximation_value   decimal(27, 25) not null comment '근사값',
    original_value        decimal(27, 25) not null comment '원본값',
    reinforcement_pattern varchar(255)    not null comment '강화 패턴',
    primary key (stat_type, approximation_value)
)
    comment '(meta)부옵션 근사값';


create table artifact_main_stat_meta
(
    code      int             not null comment '고유id',
    rarity    int default 5   not null comment '성유물 등급',
    level     int default 1   not null comment '레벨',
    stat_type varchar(50)     not null comment '옵션 종류',
    value     decimal(27, 25) not null comment '값',
    primary key (rarity, level, code)
)
    comment '(meta) 주옵션 정보';

create table artifact_sub_stat_meta
(
    code      int             not null comment '고유id'
        primary key,
    rarity    int default 5   not null comment '성유물 등급',
    stat_type varchar(50)     not null comment '옵션 종류',
    tier      int default 1   not null comment '부옵션 등급',
    value     decimal(27, 25) not null comment '값'
)
    comment '(meta) 부옵션 정보';