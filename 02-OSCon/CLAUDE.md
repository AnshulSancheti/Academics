# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## What this repo is

An Obsidian-style markdown notes vault for the **Operating Systems & Concurrency** course (`02-OSCon`), one of three subject directories under `~/Life/03-Academics/` (alongside `01-DBMS` and `03-DataAnalysis`). There is no code, build system, or test suite — work here is reading, editing, and extending lecture notes.

The directory is also tracked by the `code-review-graph` MCP server (see `.code-review-graph/graph.db`), but the graph is empty for this vault (0 nodes/files/languages) because the content is prose, not source. Skip the graph-first guidance from `~/CLAUDE.md` here and use Read/Grep directly.

## File conventions

**Naming.** One file per lecture: `Class N (Nth Month).md` (e.g. `Class 1 (24th April).md`). Keep this exact pattern when adding new classes — the parenthesized date is the lecture date, not the file's mtime.

**Frontmatter.** Every class file starts with YAML:
```yaml
---
class: 1
date: 2026-04-24            # ISO date of the lecture
subject: Operating Systems & Concurrency
topics: [intro, functions-of-os, system-calls, distributed-systems]
---
```

**Structure.** Notes are written for self-study and exam revision, not as transcripts. The established shape is:
1. `# Class N — Title`
2. `> [!abstract] TL;DR` block summarizing the lecture in one paragraph
3. Numbered top-level sections (`## 1.`, `## 2.`, …) building from a motivating example to general theory
4. `## Quick Recap` flashcard-style checklist near the end
5. `## Open Questions to Carry into Class N+1` to thread continuity between lectures

**Obsidian flavors in use** (preserve when editing):
- Callouts: `> [!abstract]`, `> [!question]`, `> [!info]`, `> [!tip]`, `> [!example]`. Questions are used as section-opening hooks; the prose then answers them.
- Image embeds: `![[Pasted image YYYYMMDDHHMMSS.png]]` and `![[... |width]]` for sized embeds. These resolve via Obsidian's attachment folder, not relative paths — do not rewrite them as standard markdown image links.
- Mermaid diagrams (`flowchart`, `stateDiagram-v2`, `sequenceDiagram`) are used heavily; prefer adding a diagram over a long bulleted list when explaining flow or state.
- ASCII box diagrams inside fenced code blocks are used for memory layouts and similar — keep them when they're already there rather than converting to mermaid.

**Tone.** Explanatory, second-person where useful, with concrete examples (the Java `int[100]` example in Class 1 is the running motif). Tables are used for taxonomies/comparisons; prefer tables over long bullet lists when content has parallel structure.

## When extending notes

- New class file → copy the section skeleton from `Class 1 (24th April).md` (TL;DR → numbered sections → Quick Recap → Open Questions) and increment `class:` / update `date:` and `topics:`.
- The "Open Questions" at the end of one class are the seed for the next class's motivating example — when adding `Class N+1`, look at `Class N`'s open questions first.
- Don't break Obsidian wiki-link or embed syntax (`[[...]]`, `![[...]]`) when reformatting.
