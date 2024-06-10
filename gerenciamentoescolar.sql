-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 10/06/2024 às 22:29
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `gerenciamentoescolar`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `usuario`
--

CREATE TABLE `usuario` (
  `id` int(2) NOT NULL,
  `nome` varchar(255) DEFAULT '',
  `telefone` varchar(20) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `rg` varchar(12) DEFAULT NULL,
  `rua` varchar(255) DEFAULT NULL,
  `cidade` varchar(255) DEFAULT NULL,
  `bairro` varchar(255) DEFAULT NULL,
  `numero` varchar(10) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `pais` varchar(255) DEFAULT NULL,
  `pai` varchar(255) DEFAULT NULL,
  `mae` varchar(255) DEFAULT NULL,
  `escolaridade` varchar(255) DEFAULT NULL,
  `cargo` enum('Admin','Aluno','Funcionario','Professor','Diretor','Zelador') NOT NULL,
  `aniversario` date DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `usuario`
--

INSERT INTO `usuario` (`id`, `nome`, `telefone`, `email`, `cpf`, `rg`, `rua`, `cidade`, `bairro`, `numero`, `estado`, `pais`, `pai`, `mae`, `escolaridade`, `cargo`, `aniversario`, `senha`) VALUES
(1, 'admin', '(00) 0000-00000', 'email@gmail.com', '000.000.000-00', '00.000.000-0', 'rua', 'cidade', 'bairro', '00000', '1', '1', 'pai', 'mae', 'escolaridade', 'Admin', '0002-11-30', 'admin'),
(2, 'aluno', '(12) 9983-11414', 'aluno@gmail.com', '414.068.198-16', '79.414.123-1', 'rua', 'cidade', 'bairro', '12113', '0', '0', 'pai', 'mae', 'escolaridade', 'Aluno', '2005-06-05', 'aluno'),
(3, 'funcionario', '(  )     -     ', '', '333.181.414-10', '97.713.913-2', 'rua', 'cidade', 'bairro', '31414', '3', '0', 'pai', 'mae', 'escolaridade', 'Funcionario', '1998-04-05', 'funcionario'),
(4, 'novoAdmin', '1111-1111', 'novo@admin.com', '111.111.111-11', '11.111.111-1', 'Rua A', 'Cidade B', 'Bairro C', '123', 'Estado D', 'Pais E', 'Pai F', 'Mae G', 'Superior', 'Admin', '1980-01-01', 'senhaAdmin');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
