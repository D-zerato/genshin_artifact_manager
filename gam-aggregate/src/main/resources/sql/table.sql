create table artifact_meta_stat
(
    code          int              not null comment '고유id',
    level         int              not null comment '등급',
    stat_category varchar(20)      not null comment '구분',
    stat_type     varchar(50)      not null comment '옵션 종류',
    sub_stat_tier int default null null comment '부옵션 등급',
    value         decimal(27, 25)  not null comment '값',
    constraint artifact_meta_stat_pk
        primary key (code)
)
    comment '(meta) 성유물 스텟';

create table approximation_meta_stat
(
    approximation_value   decimal(27, 25)           not null comment '근사값',
    stat_type             int                       not null comment '스텟 유형',
    stat_category         int                       not null comment '구분',
    original_value        decimal(27, 25)           not null comment '원값',
    reinforcement_pattern varchar(100) default null null comment '부옵션 강화 정보',
    constraint approximation_meta_stat_pk
        primary key (approximation_value, stat_type)
)
    comment '(meta)스텟 근사값';

