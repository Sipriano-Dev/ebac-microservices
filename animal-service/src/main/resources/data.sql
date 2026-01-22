

-- Raças de cachorro
INSERT INTO raca (nome, tipo_animal) VALUES ('Vira-lata', 'CACHORRO');
INSERT INTO raca (nome, tipo_animal) VALUES ('Labrador', 'CACHORRO');
INSERT INTO raca (nome, tipo_animal) VALUES ('Pastor Alemão', 'CACHORRO');

-- Raças de gato
INSERT INTO raca (nome, tipo_animal) VALUES ('Siamês', 'GATO');
INSERT INTO raca (nome, tipo_animal) VALUES ('Persa', 'GATO');
INSERT INTO raca (nome, tipo_animal) VALUES ('Maine Coon', 'GATO');


-- ===============================
-- ANIMAIS
-- ===============================

INSERT INTO animal (
    nome_provisorio,
    idade_estimada,
    raca_id,
    data_entrada,
    data_adocao,
    condicoes_chegada,
    nome_recebedor,
    data_obito,
    porte
) VALUES
(
    'Thor',
    2,
    1, -- Vira-lata (CACHORRO)
    '2024-08-10',
    NULL,
    'Resgatado da rua com sinais de desnutrição',
    'Maria Silva',
    NULL,
    'Médio'
),
(
    'Luna',
    0,
    4, -- SRD (GATO)
    '2024-09-05',
    '2024-11-20',
    'Encontrada abandonada em uma caixa',
    'João Pereira',
    NULL,
    'Pequeno'
),
(
    'Max',
    8,
    3, -- Pastor Alemão
    '2023-12-15',
    NULL,
    'Chegou com ferimentos graves após atropelamento',
    'Carlos Souza',
    '2024-02-02',
    'Grande'
);


